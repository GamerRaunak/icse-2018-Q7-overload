import java.util.*;
public class overload_vol
{
    double volume(double R)
    {
        double V=(4/3.0)*(22/7.0)*Math.pow(R,3);
        return V;
    }
    double volume(double H,double R)
    {
        double V=(22/7.0)*R*R*H;
        return V;
    }
    double volume(double L,double B,double H)
    {
        double V=L*B*H;
        return V;
    }
}//end of class
