class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor){
            return image;
        }
        fillCurrent(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
    public void fillCurrent(int[][] image, int sr, int sc, int newColor,int oldColor){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=oldColor){
            return;
        }
        image[sr][sc]=newColor;
        fillCurrent(image,sr-1,sc,newColor,oldColor);
        fillCurrent(image,sr+1,sc,newColor,oldColor);
        
        fillCurrent(image,sr,sc-1,newColor,oldColor);
        fillCurrent(image,sr,sc+1,newColor,oldColor);
    }    
}