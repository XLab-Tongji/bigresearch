package com.monetware.mapper.analysis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.monetware.model.analysis.AnalysisProjectClusteInfo;
import com.monetware.model.analysis.AnalysisSentime;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalysisSentimeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table analysis_sentime_0
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table analysis_sentime_0
     *
     * @mbg.generated
     */
    int insert(@Param("projectId")long projectId,@Param("textInfoId")long textInfoId,@Param("positiveScore") int positiveScore,@Param("negativeScore") int negativeScore,@Param("text") String text);


    
    
    
    
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table analysis_sentime_0
     *
     * @mbg.generated
     */
    int insertSelective(AnalysisSentime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table analysis_sentime_0
     *
     * @mbg.generated
     */
    AnalysisSentime selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table analysis_sentime_0
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AnalysisSentime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table analysis_sentime_0
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(AnalysisSentime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table analysis_sentime_0
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AnalysisSentime record);
    
    
    int createAnalysisSentimeTable(@Param("analysisProjectId") long analysisProjectId);
  
    
    
    int dropAnalysisSentimeTable(@Param("analysisProjectId") long analysisProjectId);
    
    
    List<AnalysisSentime> getSentimeResult(@Param("analysisProjectId")long projectId,@Param("pageStart") long pageStart,@Param("pageSize") long pageSize);

	long getSentimeResultNo(@Param("analysisProjectId")long projectId);
    
    
    
    
    
    
}