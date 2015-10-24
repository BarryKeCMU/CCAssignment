import java.util.ArrayList;

//Solution47.java

/**
*  This class traverses a list of dependencies and prints out the ordering of each element in the list.
*
*  Notes: I did not know how to do it. I asked Haibo Li for hints and I finally figured out this problem.
*  
* @author Barry Ke
* @version: Last modified on October 23, 2015
*/


import java.util.*;

public class Solution47
{
	public static void main(String [] args){
		String [] str = {"a","b","c","d","e","f"};
		String [][] dependency = {{"d", "a"}, {"b", "f"}, {"d", "b"}, {"a", "f"}, {"c", "d"}};
		ArrayList <String> result = sort(str, dependency);
         
		for (int i = 0; i < result.size(); i++){
		    System.out.print(result.get(i) + " ");
		}
        
	}
	
	public static ArrayList<String> sort(String [] str, String [][] dependency){
		HashMap <String, Integer> topoHash = new HashMap <String, Integer>();
		for (int i = 0; i < str.length; i++){
			topoHash.put(str[i], 0);
		}
		
		for (int i = 0; i < dependency.length; i++){
			//walk through all the nodes that have incoming edges and record the number of incoming
			//edges for each of them.
			String temp = dependency[i][0];
			if (topoHash.containsKey(temp)){
				topoHash.put(temp, topoHash.get(temp) + 1);
			}
			//there may be some nodes that are not connected in the graph
			else topoHash.put(temp, 1);
		}
		
		
		ArrayList <String> result = new ArrayList<String>();
        
		for (int i = 0; i < str.length; i++){
			String node = findZeroIncoming(topoHash);
           
			if (node == null) return result;
			
			result.add(node);
			
			for (int j = 0; j < dependency.length; j++){
				String first = dependency[j][0];
				String second = dependency[j][1];
				
				//if node has outgoing edges to other nodes, reduce the number of incoming edges of the other node that the
				//node points to by one unit and then remove the node.
				if (node == second){
					topoHash.put(first, topoHash.get(first) - 1);					
				}
			}
			topoHash.remove(node);
		}
		
		return result;
	}
	
	public static String findZeroIncoming(HashMap<String, Integer> topoHash){
		for(Map.Entry<String, Integer>  entry: topoHash.entrySet()){
			if (entry.getValue() == 0) return entry.getKey();
		}
		return null;
	}
}