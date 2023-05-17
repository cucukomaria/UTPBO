
package rectangle;

    public class Rectangle{
        private double width;
        private double height;
        
    public Rectangle(double widht,double height){
        this.width = width;
        this.height = height;
    }
    public double calculate_area(){
        return width*height;
    }
    public double calculate_perimeter()
    {
        return 2*(width+height);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        
        double area = rectangle.calculate_area();
        double perimeter = rectangle.calculate_perimeter();
        
        System.out.println("Luas persegi panjang: "+ area);
        System.out.println("Keliling persegi panjang:" + perimeter);
    }
    
}
