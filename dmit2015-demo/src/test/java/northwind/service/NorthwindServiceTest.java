package northwind.service;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.jboss.arquillian.transaction.api.annotation.TransactionMode;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
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
	public void testFindOneRegion() {
		Region region1 = northwindDB.findOneRegion(1);
		assertNotNull(region1);
		assertEquals(1, region1.getRegionID());
	}
	
	@Test
	@InSequence(1)
	@Transactional(TransactionMode.ROLLBACK)
	public void testCreateRegion() throws Exception {
		Region newRegion = new Region();
		newRegion.setRegionDescription("Sample Description");
		northwindDB.addRegion(newRegion);
		assertTrue(newRegion.getRegionID() > 0);		
	}
	
	
	@Test
	@InSequence(2)
	public void testReadOneRegion() throws Exception {
		Region currentRegion = northwindDB.findOneRegion(4);
		assertNotNull(currentRegion); 
		assertEquals(4, currentRegion.getRegionID());
		assertEquals("Southern", currentRegion.getRegionDescription().trim());		
	}
	
	@Test
	@InSequence(3)
	public void testReadAllRegion() {
		List<Region> regions = northwindDB.findAllRegion();
		assertEquals(4, regions.size());
	}
	
	@Test
	@InSequence(4)
	@Transactional(TransactionMode.ROLLBACK)
	public void testUpdateRegion() throws Exception {
		Region updateRegion = northwindDB.findOneRegion(4);
		assertNotNull(updateRegion); 
		updateRegion.setRegionDescription("Updated Description");
		northwindDB.updateRegion(updateRegion);
	}
	
	@Test
	@InSequence(5)
	public void testDeleteRegion() throws Exception {
//		Region newRegion = new Region();
//		newRegion.setRegionDescription("Sample Description");
//		northwindDB.addRegion(newRegion);
//		northwindDB.deleteRegion(newRegion);
	}
	
	
	
}
