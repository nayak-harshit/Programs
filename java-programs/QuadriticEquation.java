public class QuadriticEquation {
    public static void quadEqSolver(double a, double b, double c) {
        double soln1 = (-(Math.sqrt(((b*b)-4*a*c)))-b)/2*a;
        double soln2 = ((Math.sqrt(((b*b)-4*a*c)))-b)/2*a;
        System.out.println("Root 1: "+ soln1 + "\nRoot 2: "+soln2);

    }
    public static void main(String[] args) {
        quadEqSolver(1, 5, 6);
    }
    
}
