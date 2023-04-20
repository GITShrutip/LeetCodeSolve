package LeetCodePractice;

import java.util.Stack;

public class SimplifyPathtoCanonicalPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(simplifyPath1("/a/./b/../../c/"));

	}

	
	public static String simplifyPath1(String path) {

		Stack<String> stack = new Stack<>();
        String[] str = path.split("/");
        for(int i = 0; i < str.length; i++){
            if(str[i].isEmpty()){
                continue;
            }
            if(str[i].equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if(!str[i].equals("..") && !str[i].equals(".")){
                stack.push(str[i]);
            }
        }
        if(stack.isEmpty()){ 
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop()).insert(0, "/");
            
           
        }
        return sb.toString();
    }
}



//
//
//public static String simplifyPath(String path) {
//
//	char[] c = path.toCharArray();
//	Stack<Character> st = new Stack<>();
//	st.push('/');
//	int flag=0;
//	for (int i = 1; i < path.length()-1; i++) {
//		switch (path.charAt(i)) {
//			case '/':
//				if (path.charAt(i) == '/' && path.charAt(i + 1) == '/') {
//					st.push('/');
//					continue;
//				}
//				break;
//
//			case '.':
//				if (path.charAt(i) == '.' && path.charAt(i + 1) == '.') {
//					flag=flag+1;
//					continue;
//				}
//				else if(path.charAt(0)=='.') {
//					
//				}
//				break;
//			default:
//				if(Character.isLetter(path.charAt(i)) && Character.isLetterOrDigit(path.charAt(i+1))) {
//					st.push(path.charAt(i));
//				}
//				else if(Character.isLetter(path.charAt(i)) && path.charAt(i+1) == '/' && flag==1)
//				{
//					st.push(path.charAt(i));
//					flag=0;
//				}
//			
//
//			
//		}
//	}
//
//	StringBuffer sf = new StringBuffer();
//	while (!st.empty()) {
//		sf.append(st.pop());
//	}
//	return sf.reverse().toString();
//}
