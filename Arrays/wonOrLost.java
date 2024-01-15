class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        //hashmap for keeping count of how many times lost
        HashMap<Integer,Integer> losses = new HashMap<>();
        //hashset for classifying winners
        HashSet<Integer> players = new HashSet<>();

        for(int[] match : matches){
            int winner = match[0];
            int looser = match[1];
            losses.put(looser,losses.getOrDefault(looser,0)+1);
            players.add(winner);
            players.add(looser);
        }

        List<Integer> noLoss = new ArrayList();
        List<Integer> oneLoss = new ArrayList();

        for(int player : players){
            int lost = losses.getOrDefault(player,0);
            if(lost==0){
             noLoss.add(player);
            }else if(lost==1){
                oneLoss.add(player);
            }
        }

        Collections.sort(noLoss);
        Collections.sort(oneLoss);

        List<List<Integer>> result = new ArrayList<>();
        result.add(noLoss);
        result.add(oneLoss);

        return result;
    }
}