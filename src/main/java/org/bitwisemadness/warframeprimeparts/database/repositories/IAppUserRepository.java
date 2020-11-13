package org.bitwisemadness.warframeprimeparts.database.repositories;

import org.bitwisemadness.warframeprimeparts.database.model.users.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUser, String> {
    Optional<AppUser> findByName(String name);

}
