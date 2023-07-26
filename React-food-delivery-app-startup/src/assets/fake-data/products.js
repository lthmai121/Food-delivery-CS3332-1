// all images imported from images directory


import product_02_image_01 from "../images/product-2.jpg";
import product_02_image_02 from "../images/product-2.1.jpg";
import product_02_image_03 from "../images/pho-zoom.webp";

import product_03_image_01 from "../images/mamtom.jpg";
import product_03_image_02 from "../images/mamtom-1.jpg";
import product_03_image_03 from "../images/mamtom-2.jpg";

import product_04_image_01 from "../images/comtam.jpg";
import product_04_image_02 from "../images/comtam-1.jpg";
import product_04_image_03 from "../images/comtam-2.jpg";

import product_05 from "../images/springroll.jpg";

import product_06 from "../images/banhxeo.jpg";


const products = [


  {
    id: "02",
    title: "Pho",
    price: 15.0,
    image01: product_02_image_01,
    image02: product_02_image_02,
    image03: product_02_image_03,
    category: "Cuisine",
    
    desc: "Vietnamese soup consisting of bone broth, rice noodles, and thinly sliced meat (usually beef). It may also be served with bean sprouts, fresh herbs, limes, chiles, and other garnishes.",
  },

  {
    id: "03",
    title: "Bun Dau Mam Tom",
    price: 17.0,
    image01: product_03_image_01,
    image02: product_03_image_02,
    image03: product_03_image_03,
    category: "Cuisine",
    
    desc: "Bun dau mam tom is one of the most well-known dishes in Vietnamese cuisine in general and Hanoi cuisine in particular. As the name suggests, this dish consists of vermicelli, deep-fried tofu, and fermented shrimp paste.",
  },

  {
    id: "04",
    title: "Broken Rice",
    price: 16.0,
    image01: product_04_image_01,
    image02: product_04_image_02,
    image03: product_04_image_03,
    category: "Cuisine",
    
    desc: "Cơm tấm is a Vietnamese dish made from rice with fractured rice grains. Tấm refers to the broken rice grains, while cơm refers to cooked rice.",
  },


  {
    id: "07",
    title: "Spring Roll",
    price: 8.0,
    image01: product_05,
    category: "Cuisine",
    
    desc: "This traditional Vietnamese Spring Roll recipe (gỏi cuốn) is full of fresh veggies, herbs, soft slices of pork, and shrimp all brought together with a super flavorful hoisin and peanut dipping sauce.",
  },

  {
    id: "08",
    title: "Banh Xeo",
    price: 15.0,
    image01: product_06,
    category: "Cuisine",
    
    desc: "Banh xeo are Vietnamese rice pancakes filled with various vegetables and meats. Thin and crispy, the finished pancakes are cut into pieces, tucked into lettuce wraps, and finished with fragrant herbs and a spicy nuoc cham dipping sauce.",
  },

];

export default products;
