# OVERVIEW

In  this  code  example, emp1.bankVault, emp2.bankVault,  and Emp.bank-Vault all refer to the samestatic attribute: bankVault.

# EXAM TIP

- Even  though  you  can  use  an  object  reference  variable  to  accessstatic members, it’s not advisable to do so. Because static members belongto  a  class  and  not  to  individual  objects,  using  object  reference  variables  toaccess static members may make them appear to belong to an object. Thepreferred  way  to  access  them  is  by  using  the  class  name.
- The static  andfinal nonaccess modifiers can be used together to define constants (variableswhose value can’t change).

# Example

class Emp {
    public static final int MIN_AGE = 20;
    static final int MAX_AGE = 70;
 }