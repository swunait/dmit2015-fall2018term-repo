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
	
	
}
