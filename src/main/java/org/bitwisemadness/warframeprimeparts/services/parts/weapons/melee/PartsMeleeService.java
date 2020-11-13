package org.bitwisemadness.warframeprimeparts.services.parts.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.melee.PartsMelee;
import org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.melee.IPartsMeleeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsMeleeService implements IPartsMeleeService {
    @Autowired
    private IPartsMeleeRepository repository;

    @Override
    public List<PartsMelee> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<PartsMelee> findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public PartsMelee findByNameByUser(String name, String appUser) {
        Optional<PartsMelee> optional = this.repository.findByNameByUser(name, appUser);
        return optional.orElse(null);
    }

    @Override
    public void put(PartsMelee parts) {
        this.repository.save(parts);
    }

    @Override
    public void delete(String name, String appUser) {
        Optional<PartsMelee> optional = this.repository.findByNameByUser(name, appUser);
        optional.ifPresent(melee -> this.repository.delete(melee));
    }
}
