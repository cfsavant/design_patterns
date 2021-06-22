package org.jsg.creational.factory.staticfactorymethod;
/* NOT CONSIDERED ONE OF THE OFFICIAL DESIGN PATTERNS
    but still a good approach for certain problems.
    Used in collections api and Util classes.

 */
class User {
    Integer id;
    String name;

    private User(Integer id) {
        id = id;
    }

    private User(Integer id, String name) {
        id = id;
        name = name;
    }

    public static User load(Integer id) {
        return new User(id);
    }

    public static User createUserWithAName(Integer id, String name) {
        //list($id, $name, $email, $phone) = DB::load_data('users', 'id', 'name', 'email', 'phone');
        return new User(id, name);

    }

}
