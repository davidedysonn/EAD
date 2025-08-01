package com.ead.course.repositories;

import com.ead.course.models.CourseModel;
import com.ead.course.models.ModuleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;
//ps. ctrl+alt+o elimina as dependencias que nao estao sendo ultilizadas.
public interface ModuleRepository extends JpaRepository<ModuleModel, UUID> {
    /* Usando  @EntityGraph a consulta abaixo usando
     * o metodo findByTitle trara a consulta na forma
     * EAGER ou seja, fara a consulta carregando tudo.
     */
//    @EntityGraph(attributePaths = {"course"})
//    ModuleModel findByTitle(String titile);

    // @Modifying poderia ser usado caso fosse nescessario um update ou um delete customizado
    @Query(value = "select * from tb_modules where course_course_id = :courseId", nativeQuery = true)
    List<ModuleModel> findAllModulesIntoCourse(@Param("courseId") UUID courseId);
    
}
