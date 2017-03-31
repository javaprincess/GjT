package gjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import org.springframework.context.annotation.Bean;


@SpringBootApplication
//@EnableNeo4jRepositories
public class GJTOfferServer extends Neo4jConfiguration {

	public GJTOfferServer() {
		setBasePackage("gjt");
	}

	/*@Bean(destroyMethod = "shutdown")
        public GraphDatabaseService graphDatabaseService() {
                return new GraphDatabaseFactory().newEmbeddedDatabase("target/offers.db");
        }*/

	
	public static void main(String[] args) {
		SpringApplication.run(GJTOfferServer.class, args);
	}

}
