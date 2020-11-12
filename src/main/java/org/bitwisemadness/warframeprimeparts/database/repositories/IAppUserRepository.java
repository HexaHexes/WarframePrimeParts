package org.bitwisemadness.warframeprimeparts.database.repositories;

import org.bitwisemadness.warframeprimeparts.database.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUser, String> {
}
