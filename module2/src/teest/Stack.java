package teest;

class Stack
{
    int size;
    int top;
    char[] a;

    //function to check if stack is empty
    boolean isEmpty()
    {
        return (top < 0);
    }

    Stack(int n)
    {
        top = -1;
        size = n;
        a = new char[size];
    }

    //function to push element in Stack
    boolean push(char x)
    {
        if (top >= size)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }

    //function to pop element from stack
    char pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            char x = a[top--];
            return x;
        }
    }
}
