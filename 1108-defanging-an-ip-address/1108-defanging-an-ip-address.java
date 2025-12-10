class Solution {
    public String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder();
        for(char c :address.toCharArray()){
            switch(c){
                case'.':
                res.append("[.]");
                break;
                default:
                res.append(c);
            }
            
        }
        return res.toString();
    }
}