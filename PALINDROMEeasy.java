class PALINDROMEeasy {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String original=Integer.toString(x);
        String reverse=new StringBuilder(original).reverse().toString(); 
        return original.equals(reverse);
    }
    public static void main(String[] args){
       PALINDROMEeasy solution=new PALINDROMEeasy();
       System.out.println(solution.isPalindrome(121));
       System.out.println(solution.isPalindrome(-121));
       System.out.println(solution.isPalindrome(10));
    }
}