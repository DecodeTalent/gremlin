package com.tinkerpop.gremlin.functions.graph;

import com.tinkerpop.gremlin.db.tg.TinkerGraph;
import com.tinkerpop.gremlin.model.Graph;
import com.tinkerpop.gremlin.BaseTest;
import com.tinkerpop.gremlin.XPathEvaluator;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 * @version 0.1
 */
public class LoadFunctionTest extends BaseTest {

    public void testLoadFunction() {
        Graph graph = new TinkerGraph();
        assertEquals(countIterator(graph.getVertices()), 0);
        XPathEvaluator xe = new XPathEvaluator();
        xe.setVariable("$_g", graph);
        //TODO: where is this file in test cases ? xe.evaluateList("g:load('src/test/resources/com/tinkerpop/gremlin/model/parser/graph-example-1.xml')");
    }
}
