package northwind.service;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import ca.nait.dmit.util.Resources;
import northwind.entity.Region;

@RunWith(Arquillian.class)
public class NorthwindServiceTest {
	
	@Deployment
    public static Archive<?> createTestArchive() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
        		.addPackage("northwind.entity")
                .addClasses(NorthwindService.class, Resources.class)
                .addAsResource("META-INF/persistence.xml")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
   }

	@Inject
	private NorthwindService northwindDB;
	
	@Test
	public void testFindRegions() {
		List<Region> regions = northwindDB.findAllRegion();
		// There should be 4 regions in total
		assertEquals(4, regions.size());
	}
	
	@Test
	public void testFindOneRegion() {
		Region region1 = northwindDB.findOneRegion(1);
		assertNotNull(region1);
		assertEquals(1, region1.getRegionID());
	}
	
	@Test
	public void testCreateUpdateRegion() throws Exception {
		Region newRegion = new Region();
		newRegion.setRegionDescription("Sample Description");
		northwindDB.addRegion(newRegion);
		Region updateRegion = northwindDB.findOneRegion(newRegion.getRegionID());
		assertNotNull(updateRegion);
		assertEquals(updateRegion.getRegionID(), newRegion.getRegionID());
		assertEquals(updateRegion.getRegionDescription(), newRegion.getRegionDescription());
		northwindDB.deleteRegion(updateRegion);
		Region deletedRegion = northwindDB.findOneRegion(newRegion.getRegionID());
		assertNull(deletedRegion);
		
	}
	
	
	
}
