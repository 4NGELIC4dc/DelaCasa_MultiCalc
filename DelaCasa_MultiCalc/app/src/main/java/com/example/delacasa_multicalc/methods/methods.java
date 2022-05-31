package com.example.delacasa_multicalc.methods;
import java.lang.Math;

public class methods {
    //calculate for...
    //volume
    public double volume(double volLength, double volWidth, double volHeight){return ((volLength * volWidth * volHeight) / 3);}
    //kinetic
    public double kinetic(double kinMass, double kinVelocity){return (0.5 * (kinMass * (kinVelocity * kinVelocity)));}
    //acceleration
    public double acceleration(double accTime, double accVelocity){return (accTime/accVelocity);}
    //pressure
    public double pressure(double prsrForce, double prsrArea){return (prsrForce/prsrArea);}
    //power
    public double power(double pwrWork, double pwrTime){return (pwrWork/pwrTime);}
    //mass
    public double mass(double massVolume, double massDensity){return (massVolume*massDensity);}

    //find area of...
    //triangle
    public double triangleA(double triBase, double triHeight){return ((0.5) * triBase * triHeight);}
    public double triangleB(double triBase, double triHeight){return ((triBase * triHeight) / 4);}

    //rectangle
    public double rectangle(double recLength, double recWidth, double recAnswer){
        recAnswer = recLength * recWidth;
        return (recAnswer);
    }
    //square
    public double square(double sqr, double sqrAnswer){
        sqrAnswer = sqr * sqr;
        return (sqrAnswer);
    }
    //sphere
    public double sphere(double sphr, double sphrAnswer){
        sphrAnswer = (4 / 3) * Math.PI * (sphr * sphr *sphr);
        return (sphrAnswer);
    }
}
