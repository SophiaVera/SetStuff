import java.util.ArrayList;
import java.util.Arrays;

/**
 * Main contains all of the methods and implementations from setstuff on CodingBat.
 */
public class Main {
	/**
	 * Return an ArrayList<Integer> that contains 17.
	 * @return ArrayList with 17
	 */
	ArrayList<Integer> ret17() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(new Integer(17));
		return a;
	}

	/**
	 * Take an ArrayList<Integer> and return its zeroth element.
	 * @param al
	 * @return al's 0th index
	 */
	Integer zerothElement(ArrayList<Integer> al){
		return al.get(0);
	}
	
	/**
	 * contains is a method that returns true when the int array ar contaits a the int argument
	 * @param a
	 * @param ar
	 * @return whether a is in ar
	 */
	boolean contains(int a, int[] ar){
		for(int i: ar){
			if(i==a){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Takes two arrays and returns true if any element of a is in b.
	 * @param a
	 * @param b
	 * @return whether a and b share an element
	 */
	boolean anyContains(int[] a, int[] b){
		for(int i: a){
			for(int j : b){
				if(j == i){
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Return the int array that contains all elements in either a or b. You may assume the intersection 
	 * of a and b is empty. You will need to order the elements as they are in a then as they are in b.
	 * @param a
	 * @param b
	 * @return union of a and b
	 */
	int[] union(int[] a, int[] b){
		int[] c = new int[a.length+b.length];
		for(int i =0; i<a.length; i++){
			c[i]=a[i];
		}
		for(int i = a.length; i< a.length+b.length; i++){
			c[i]=b[i-a.length];
		}
		return c;
	}
	
	/**
	 * Write the intersect method: It returns an array that: 1: Is sorted 2: Has no repeat values
	 *  3: Contains any value that is in both a and b NOTE: You may assume a and b are sorted (lowest to highest)
	 * @param nums1
	 * @param nums2
	 * @return intersection of nums1 and nums2
	 */
	int[] intersect(int[] nums1, int[] nums2){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<nums1.length; i++){
			if(i==0 || (i>0 && nums1[i]!=nums1[i-1])){
				if(Arrays.binarySearch(nums2, nums1[i])>-1){
					list.add(nums1[i]);
				}
			}
		}
	    int[] result = new int[list.size()];
	    int k=0;
	    for(int i: list){
	        result[k++] = i;
	    }
	    return result;
	}

	/**
	 * Take three arrays, one boolean one integer. and one String. Return the String at the index of the smallest integer
	 *  for which the corresponding boolean is false. For example: Boolean (visited): {true, false, false} integer (distance):
	 *   {1,2,3} String (node): {"A", "B", "C"} results in a return value of "B" because node B has a distance of 2 which 
	 *   is the smallest of the values not yet visited. Return the empty string if no distances qualify. You may assume
	 *    the largest value in distance is less than 99999.
	 * @param visited
	 * @param distance
	 * @param nodeName
	 * @return the nearest unvisited node
	 */
	String nearesUnvisitedNode(boolean[] visited, int[] distance, String[] nodeName){
		int visit = 99999;
		String node = "";
	 	for(int i =0; i< visited.length; i++){
	 	if(!visited[i]){
	 		if (distance[i]<visit){
	 			visit = distance[i];
	 			node = nodeName[i];
	 		}
	 	}
	 	}
		  return node;
	}
	
	/**
	 * Take three ints and return an arrayList containing them.
	 * @param a
	 * @param b
	 * @param c
	 * @return ArrayList containing a, b, and c
	 */
	ArrayList<Object> listify(int a, int b, int c){
		ArrayList<Object> ret = new ArrayList<Object>();
		ret.add(new Integer(a));
	    ret.add(new Integer(b));
	    ret.add(new Integer(c));
	    return ret;
	}

	/**
	 * Take an arraylist of arraylists of integers, and three integers, and make those three integers into 
	 * an arrayslist and add that arraylist to the given arraylist and return that.
	 * @param graph
	 * @param a
	 * @param b
	 * @param c
	 * @return graph with added edge containing a, b, and c
	 */
	ArrayList<ArrayList<Object>> addEdge(ArrayList<ArrayList<Object>> graph, int a, int b, int c){
		ArrayList<Object> arr = new ArrayList<>();
		arr.add(new Integer(a));
		arr.add(new Integer(b));
		arr.add(new Integer(c));
		graph.add(arr);
		return graph;
	}

	/**
	 * Take an arraylist of arraylists of size three of integers and return an arraylist that 
	 * contains the union of all the integers that appear in the first two elements of each 
	 * arraylist of size three. To pass thetest cases your returned arraylist must be in the order elements appear in the argument.
	 * @param edgelist
	 * @return ArrayList of the nodes in edgelist
	 */
	ArrayList<Integer> collectNodes(ArrayList<ArrayList<Integer>> edgelist){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(ArrayList<Integer> arr: edgelist){
			if(!ret.contains(arr.get(0))){
				ret.add(arr.get(0));
		    }
			if(!ret.contains(arr.get(1))){
				ret.add(arr.get(1));
		    }
		}
		return ret;
	}
	
	/**
	 * Given an integer for the size and an intteger for the start node create an arraylist of 
	 * integers whose values are maximal excpet the entry at the index of th start, which should be sero.
	 * @param n
	 * @param start
	 * @return ArrayList of max values of length n where the start index is set to 0
	 */
	ArrayList<Integer> setInfinity(int n, int start) {
		ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == start) {
                arr.add(0);
            } else {
                arr.add(Integer.MAX_VALUE);
            }
        }
        return arr;
    }
	
	public static void main(String[] args) {}

}
