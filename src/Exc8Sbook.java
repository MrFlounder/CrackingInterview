/**
 * Created by guangshuozang on 8/15/15.
 * s1 = xy, s2 = yx ==> rotation
 * s1 must be a sunstring of s2 + s2
 *
 */
public class Exc8Sbook {
    public boolean isRotation(String s1, String s2){
        if(s1.length()==s2.length())
        return isRotation(s1+s1,s2);
        return false;
    }
}
