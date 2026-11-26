
class Solution {

    public boolean isBipartite(int[][] graph) {

        Queue<Bipartite> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();

        for(int i = 0; i < graph.length; i++) {

            if(visited.containsKey(i)) {
                continue;
            }

            q.add(new Bipartite(i, 0));

            while(!q.isEmpty()) {

                // Remove
                Bipartite rv = q.poll();

                // Ignore / Check conflict
                if(visited.containsKey(rv.var)) {

                    if(visited.get(rv.var) != rv.col) {
                        return false;
                    }

                    continue;
                }

                // Visited
                visited.put(rv.var, rv.col);

                // Add neighbours
                for(int nbr : graph[rv.var]) {

                    int nextc = (rv.col == 0 ? 1 : 0);

                    if(!visited.containsKey(nbr)) {
                        q.add(new Bipartite(nbr, nextc));
                    }
                }
            }
        }

        return true;
    }

    class Bipartite {
        int var;
        int col;

        Bipartite(int var, int col) {
            this.var = var;
            this.col = col;
        }
    }
}
