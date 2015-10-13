import java.util.LinkedList;

import org.w3c.dom.Node;

//Solution41.java

/**
*  This class finds out whether there is a route before two given nodes in a directed tree.
*
*  Notes: I do not know how to do it. I read the solution and understood the algorithm. I rewrote the codes by myself.
*  
* @author Barry Ke
* @version: Last modified on October 12, 2015
*/


enum State { UNVISITED, VISITED; }

boolean search(Graph g, Node start, Node end)
{
	if(start == end) return true;
	
	LinkedList <Node> q = new LinkedList<>();
	
	//mark all the nodes in the graph as UNVISTED
	for (Node u: g.getNodes())
	{
		u.state = State.UNVISITED;
	}
	
	q.add(start);
	Node u;
	while (!q.isEmpty())
	{
		u = q.removeFirst(); //dequeue the first node in the LinkedList q.
		
		if (u == null) return false;
		
		for (Node v: u.getAdjacent()) //I searched "getAdjacent" and I did not find this method. Here I am assuming this method
			                          //would return the adjacent nodes 
		{
			if(v.state == State.UNVISITED)
			{
				if (v == end) return true;
				else
				{
					q.add(v);
				}
					
			}
		}
		u.state = State.VISTED;
	}	
	
	return false;
}