class 문자열내p와y의개수 {
    boolean solution(String s) {
        int p,y;
        p = 0;
        y = 0;
        for(int i = 0; i<s.length(); i++){
            if(Character.toLowerCase(s.charAt(i)) == 'p'){
                p++;
            }else if(Character.toLowerCase(s.charAt(i)) == 'y'){
                y++;
            }
        }
        if(p == y){
            return true;
        }else{
            return false;
        }
    }
}