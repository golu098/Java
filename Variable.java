class Variable {
    static int employee_id = 10; // static varibale :- called with class.variable_name and saving the memory
    int pincode = 803202; // instance variable

    void employee_details(String name) {
        String address = "Patna";// local variable 
        System.out.println("My name is " + name + " and i am from " + address);

    }

    public static void main(String args[]) {
        Variable obj = new Variable();
        obj.employee_details("Shiv kant");

        System.out.println("Employee_id:" + Variable.employee_id); // calling static variable
        System.out.println("Pincode:" + obj.pincode); // instance variable

    }
}