package org.soptorshi.service;

import org.soptorshi.domain.Currency;
import org.soptorshi.repository.CurrencyRepository;
import org.soptorshi.repository.search.CurrencySearchRepository;
import org.soptorshi.service.dto.CurrencyDTO;
import org.soptorshi.service.mapper.CurrencyMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing Currency.
 */
@Service
@Transactional
public class CurrencyService {

    private final Logger log = LoggerFactory.getLogger(CurrencyService.class);

    private final CurrencyRepository currencyRepository;

    private final CurrencyMapper currencyMapper;

    private final CurrencySearchRepository currencySearchRepository;

    public CurrencyService(CurrencyRepository currencyRepository, CurrencyMapper currencyMapper, CurrencySearchRepository currencySearchRepository) {
        this.currencyRepository = currencyRepository;
        this.currencyMapper = currencyMapper;
        this.currencySearchRepository = currencySearchRepository;
    }

    /**
     * Save a currency.
     *
     * @param currencyDTO the entity to save
     * @return the persisted entity
     */
    public CurrencyDTO save(CurrencyDTO currencyDTO) {
        log.debug("Request to save Currency : {}", currencyDTO);
        Currency currency = currencyMapper.toEntity(currencyDTO);
        currency = currencyRepository.save(currency);
        CurrencyDTO result = currencyMapper.toDto(currency);
        currencySearchRepository.save(currency);
        return result;
    }

    /**
     * Get all the currencies.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Transactional(readOnly = true)
    public Page<CurrencyDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Currencies");
        return currencyRepository.findAll(pageable)
            .map(currencyMapper::toDto);
    }


    /**
     * Get one currency by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Transactional(readOnly = true)
    public Optional<CurrencyDTO> findOne(Long id) {
        log.debug("Request to get Currency : {}", id);
        return currencyRepository.findById(id)
            .map(currencyMapper::toDto);
    }

    /**
     * Delete the currency by id.
     *
     * @param id the id of the entity
     */
    public void delete(Long id) {
        log.debug("Request to delete Currency : {}", id);
        currencyRepository.deleteById(id);
        currencySearchRepository.deleteById(id);
    }

    /**
     * Search for the currency corresponding to the query.
     *
     * @param query the query of the search
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Transactional(readOnly = true)
    public Page<CurrencyDTO> search(String query, Pageable pageable) {
        log.debug("Request to search for a page of Currencies for query {}", query);
        return currencySearchRepository.search(queryStringQuery(query), pageable)
            .map(currencyMapper::toDto);
    }
}
