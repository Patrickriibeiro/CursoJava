select 
regiao as 'Região',
sum(populacao) as Total
 from estados
  GROUP by regiao
  order by Total desc

  select 
regiao as 'Região',
sum(populacao) as Total
 from estados
  

  select 
     avg(populacao) as Total
    from estados