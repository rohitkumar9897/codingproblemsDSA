class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add("0,0");

        for (char move : path.toCharArray()) {
            if(move == 'N'){
                y++;
            }
            else if(move == 'S'){
                y--;
            } 
            else if(move == 'E'){
                x++;
            }
            else{
                x--;
            }

            String currentPosition = x + "," + y;
            if (visited.contains(currentPosition)) {
                return true;  // Path has crossed itself
            }

            visited.add(currentPosition);
        }

        return false;
    }
}