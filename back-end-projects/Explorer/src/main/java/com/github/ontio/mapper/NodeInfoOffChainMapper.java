package com.github.ontio.mapper;

import com.github.ontio.model.dao.NodeInfoOffChain;
import com.github.ontio.model.dto.NodeInfoOffChainDto;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface NodeInfoOffChainMapper extends Mapper<NodeInfoOffChain> {
    NodeInfoOffChainDto selectByPublicKey(String publicKey);
}