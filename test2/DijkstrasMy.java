import java.util.HashSet;
import java.util.Set;

public class DijkstrasMy {

	private static  int[][] graph=null;
	private static Set<Integer> mst=new HashSet<>();
	private static  int[] distSet=null;
	private static  int[] mstarr=null;
	public static void main(String[] args) {
		graph=new int[][]{ { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
            { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
            { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
            { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
            { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
                
        distSet=new int[graph.length];  
        mstarr=new int[graph.length];  

        distSet[0]=0;
        for(int i=1;i<graph.length;i++) {
        	distSet[i]=Integer.MAX_VALUE;
        }
        printMst();
	}
	
	public static  int getMinIndex() {
		int minIndex=-1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<distSet.length;i++) {
			if(distSet[i]<min && !mst.contains(i)) {
				minIndex=i;
				min=distSet[i];
			}
		}
		return minIndex;
	}
	
	public static void printDijkastra(){
		
	}
	
	
	//only to print MST
	public static void printMst(){
		int count=distSet.length;
		while(count>0) {
			int minIndex=getMinIndex();
			mst.add(minIndex);
			for(int i=0;i<distSet.length;i++) {
				if(graph[minIndex][i]!=0 && !mst.contains(i) && distSet[i]>graph[minIndex][i]) {
					mstarr[i]=minIndex;
					distSet[i]=graph[minIndex][i];
				}
			}
			count--;
		}
		printing();
	}
	
	public static void printing() 
	    { 
	        System.out.println("Edge \tWeight"); 
	        for (int i = 1; i < distSet.length; i++) 
	            System.out.println(mstarr[i] + " - " + i + "\t" + graph[i][mstarr[i]]); 
	    } 
}
