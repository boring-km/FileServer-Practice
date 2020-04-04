package test.nodap.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Table(name = "file")
public class FileVO {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Column(name = "f_no") int f_no;
    
    public @Column(name = "b_no") int b_no;
    public @Column(name = "file_origin_name") String fileOriginName;
    public @Column(name = "file_url") String fileUrl;
    public @Column(name = "filename") String filename;

    public FileVO(){}
    @Builder
    public FileVO(String fileOriginName, String fileUrl, String filename) {
        this.fileOriginName = fileOriginName;
        this.fileUrl = fileUrl;
        this.filename = filename;
    }
    
}
