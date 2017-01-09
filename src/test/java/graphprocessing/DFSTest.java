package graphprocessing;

import com.google.common.collect.Lists;
import graphprocessing.model.Color;
import graphprocessing.model.Edge;
import graphprocessing.model.Graph;
import graphprocessing.model.Vertex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DFSTest
{
    DFS dfs = new DFS();

    @Test
    public void graph_dfs_1() throws Exception
    {
        Vertex s = new Vertex("S");
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");

        Graph g = new Graph(Lists.newArrayList(s, a, b, c, d));
        g.addNeighbours(s, new Edge(a));
        g.addNeighbours(s, new Edge(b));
        g.addNeighbours(a, new Edge(b));
        g.addNeighbours(a, new Edge(c));
        g.addNeighbours(b, new Edge(d));
        g.addNeighbours(d, new Edge(c));
        g.addNeighbours(c, new Edge(d));

        dfs.search(g);

        assertEquals(Color.BLACK, s.getColor());
        assertEquals(Color.BLACK, a.getColor());
        assertEquals(s, a.getPreviousNode());
    }
}
