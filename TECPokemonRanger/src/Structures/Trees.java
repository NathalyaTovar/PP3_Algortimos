package Structures;

/**
 *
 * @author fredy_000
 */
public class Trees {
   private int[][] mCoefficient = new int [51][51];
   private int[][] mAdjacency = new int [51][51];
   private int[] Xcoordenate = new int [51];
   private int[] Ycoordinate = new int [51];
   private int name [] = new int[51];
   private int inTree [];
   
   public Trees(){}

   public int getMcoefficient(int i, int j) {
       return mCoefficient[i][j];
   }

    public int getMadjacency(int i, int j) {
        return mAdjacency[i][j];
    }

    public int getXcoordenate(int i) {
        return Xcoordenate[i];
    }

    public int getYcoordenate(int i) {
        return Ycoordinate[i];
    }

    public int getName(int name) {
        return name;
    }

    public int getInTree(int i) {
        return inTree[i];
    }

    public void setMcoefficient(int i,int j ,int mCoefficient) {
        this.mCoefficient[i][j] = mCoefficient;
    }

    public void setMadjacency(int i,int j ,int mAdjacency) {
        this.mAdjacency[i][j] = mAdjacency;
    }

    public void setXcoordenate(int i,int Xcoordenate) {
        this.Xcoordenate[i] = Xcoordenate;
    }

    public void setYcoordenate(int i, int Ycoordenate) {
        this.Ycoordinate[i] = Ycoordenate;
    }

    public void setName(int i, int name) {
        this.name[i] = name;
    }

    public void setInTree(int i, int inTree) {
        this.inTree[i] = inTree;
    }
    public void createInTree(int i){
       inTree = new int [i]; 
    }  
}
