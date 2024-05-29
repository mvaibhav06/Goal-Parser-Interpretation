class Interpret {
    public String interpret(String command) {
        String out = "";
        int i = 0;
        while(i<command.length()){
            char ch = command.charAt(i);
            if(ch == 'G'){
                out += ch;
                i++;
            }else if(ch == '('){
                char c = command.charAt(i+1);
                if(c == 'a'){
                    out += "al";
                    i += 4;
                }else{
                    out += 'o';
                    i += 2;
                }
            }
        }
        return out;
    }
}
