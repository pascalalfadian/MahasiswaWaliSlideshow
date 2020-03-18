package id.ac.unpar.mahasiswawalislideshow.models;

import id.ac.unpar.siamodels.Mahasiswa;

/**
 * Pulls mahasiswa data from SIAKAD (https://siakad.unpar.ac.id)
 * @author pascal
 */
public class SIAkadDataPuller {
    
    /**
     * <p>Retrieves array of mahasiswa, who are mahasiswa wali of the current
     * dosen wali logged in. Details of mahasiswa other than nama and NPM may
     * be not be initialized.</p>
     * <p>Implementation tip: none</p>
     * @return list of mahasiswa wali
     */
    public Mahasiswa[] pullMahasiswas() {
        throw new RuntimeException("Not Implemented");
    }
    
    /**
     * <p>Retrieves detail of a single mahasiswa, as much as can be retrieved
     * from the student portal. After calling this function, the mahasiswa is
     * detailed.</p>
     * <p>Implementation tip: none</p>
     */
    public void pullMahasiswaDetail(Mahasiswa m) {
        throw new RuntimeException("Not Implemented");
    }
}
