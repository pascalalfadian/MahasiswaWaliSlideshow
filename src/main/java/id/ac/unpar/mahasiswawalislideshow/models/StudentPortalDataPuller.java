package id.ac.unpar.mahasiswawalislideshow.models;

import id.ac.unpar.siamodels.Mahasiswa;

/**
 * Pulls mahasiswa data from Student Portal (https://studentportal.unpar.ac.id/)
 * @author pascal
 */
public class StudentPortalDataPuller {
    
    /**
     * <p>Retrieves array of mahasiswa, who are mahasiswa wali of the current
     * dosen wali logged in. Details of mahasiswa other than nama and NPM may
     * be not be initialized.</p>
     * <p>Implementation tip: return array of 2 selected mahasiswa (hardcoded).
     * HTTP request may not be needed.</p>
     * @return list of mahasiswa wali
     */
    public Mahasiswa[] pullMahasiswas() {
        throw new RuntimeException("Not Implemented");
    }
    
    /**
     * <p>Retrieves detail of a single mahasiswa, as much as can be retrieved
     * from the student portal. After calling this function, the mahasiswa is
     * detailed.</p>
     * <p>Implementation tip: scrap as much as you can from Student Portal</p>
     * <p>See {@linkplain https://github.com/ftisunpar/IFStudentPortal/blob/master/app/models/support/Scraper.java} for example.</p>
     */
    public void pullMahasiswaDetail(Mahasiswa m) {
        throw new RuntimeException("Not Implemented");
    }
}
