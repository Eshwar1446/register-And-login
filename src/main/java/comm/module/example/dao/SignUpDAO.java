package comm.module.example.dao;

import java.io.Serializable;

import comm.module.example.entity.SignUpEntity;

public interface SignUpDAO {

	public Serializable save(SignUpEntity entity);
}
