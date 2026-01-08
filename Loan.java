import java.util.Date;

public class Loan {

    private static int counter = 1;

    private int loanId;
    private Date loanDate;
    private Date returnDate;
    private boolean active;

    private Member member;
    private Book book;

    public Loan(Member member, Book book) {
        this.loanId = counter++;
        this.loanDate = new Date();
        this.active = true;
        this.member = member;
        this.book = book;
    }

    public int getLoanId() {
        return loanId;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public boolean isActive() {
        return active;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public void closeLoan() {
        this.returnDate = new Date();
        this.active = false;
    }
}
