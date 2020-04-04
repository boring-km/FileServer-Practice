package test.nodap.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.nodap.project.entity.FileVO;

@Repository
public interface FileRepository extends CrudRepository<FileVO, Integer> {
}
