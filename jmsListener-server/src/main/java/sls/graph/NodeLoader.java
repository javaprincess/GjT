package sls.graph;

import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;

public class NodeLoader {

        public synchronized void load(String createString) {
                String localCreateString = createString;

                Driver driver = GraphDatabase.driver( "bolt://localhost");
                Session session = driver.session();
                session.run( localCreateString );
                session.close();
        }
}

