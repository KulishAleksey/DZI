package srez;

public class TestA {
    public static void main(String[] args) {
        User user = new User();
        user.setReferalId(112L);
    }
    static class User {
        long id;
        User referal = new User();
        public void setReferalId(long referalId) {
            this.referal.id = referalId;
        }
    }
}