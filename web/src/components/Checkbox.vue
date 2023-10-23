<template>
<!-- Demo wrapper -->
<div class="demo">
  
  <!-- Checkboxes -->
  <div class="form-checkbox">
  <input class="checkbox" type="checkbox" id="checkbox1">
  <label for="checkbox1" tabindex="1">Shawn Carter</label>
  </div>
<div class="form-checkbox">
  <input class="checkbox" type="checkbox" id="checkbox2" checked="checked">
  <label for="checkbox2" tabindex="2">Beyonce Knowles</label>
</div>
<div class="form-checkbox">
  <input class="checkbox" type="checkbox" id="checkbox4" disabled="disabled">
  <label for="checkbox4" tabindex="4">Tupac Shakur</label>
</div>
  
</div>


</template>

<script>
export default {
	name: 'Checkbox',
}

</script>

<style lang="scss">
// Variables
$checkbox-size: 20px;
$checkbox-border: #cecece;
$checkbox-selected: #02BB72; // Primary colour

.checkbox{
  position: absolute;
  opacity: 0;
  
  // Text
  & + label{
    display: inline-block;
    position: relative;
    cursor: pointer;
    line-height: $checkbox-size;
    padding-left: $checkbox-size + 10;
    font-size: $checkbox-size - 2;
    font-family: sans-serif;
    color: #666; // Label colour
    
    // Checkbox
    &:before{
      position: absolute;
      display: block;
      left: 0;
      top: 0;
      content: "";
      background: #f2f2f2;
      width: $checkbox-size;
      height: $checkbox-size;
      
      box-shadow: inset 0 0 0 1px $checkbox-border;
      border-radius: 4px;
      transition: 200ms ease-in-out all;
    }
    
    // Tick
    &:after{
      position: absolute;
      display: block;
      top: 5px;
      left: 8px;
      content: "";
      width: 3px;
      height: 7px;
      border-right: 1px solid transparent;
      border-bottom: 1px solid transparent;
      transform: rotate(45deg);
      
      transition: 200ms ease-in-out all;
    }
  }
  
  // Hover
  & + label:hover{
    color: #333;
  }
  
  // Focus
  & + label:focus{
    outline: none;
  }
  
  // Checked
  &:checked{
    & + label{
      &:before{
        background: $checkbox-selected;
        box-shadow: none;
      }
      &:after{
        border-color: white;
      }
    }
  }
  
  // Disabled
  &:disabled{
    & + label{
      &:before{
        background: #f2f2f2; // Disabled colour
        box-shadow: none;
      }
      &:after{
        border-color: transparent;
      }
    }
  }
  
  // Disabled Checked
  &:checked:disabled{
    & + label{
      &:before{
        background: #f2f2f2;
        box-shadow: none;
      }
      &:after{
        border-color: #cecece;
      }
    }
  }
}

// Additional demo styling
.form-checkbox{
  position: relative;
  display: block;
  margin: 0 0 15px;
}
.demo{
  display: block;
  width: 240px;
  margin: 50px auto;
  padding: 100px;
  border: 1px solid $checkbox-border;
  border-radius: 10px;
}

</style>