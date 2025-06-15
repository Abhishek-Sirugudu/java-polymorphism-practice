class Calculator{
    //Method Overloading

    //Same names diff types,parameters
    int add(int a,int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b){
        return a.concat(b);
    }
}

