class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int y = wallpaper.length;
        int x = wallpaper[0].length();
        for(int i = 0; i<y; i++) {
            for(int j=0; j<x; j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    minX = Math.min(j,minX);
                    maxX = Math.max(j+1,maxX);
                    minY = Math.min(i,minY);
                    maxY = Math.max(i+1,maxY);
                }
            }
        }
        return new int[]{minY,minX,maxY,maxX};
    }
}