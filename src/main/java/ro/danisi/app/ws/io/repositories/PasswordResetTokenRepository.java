package ro.danisi.app.ws.io.repositories;

import org.springframework.data.repository.CrudRepository;

import ro.danisi.app.ws.io.entities.PasswordResetTokenEntity;

public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long> {
	PasswordResetTokenEntity findByToken(String token);
}
