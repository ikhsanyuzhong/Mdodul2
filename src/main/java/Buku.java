class Buku
{
    private String judul; private String pengarang; private int jumlah;

    public	void	setNilai(String	judul,String	pengarang,int jumlah)
    {
        this.judul	= judul; this.pengarang = pengarang; this.jumlah = jumlah;
    }
    void cetakKeLayar()
    {
        System.out.println("Judul : " + judul ); System.out.println("Pengarang : " + pengarang ); System.out.println("Jumlah : " + jumlah );
    }
}


