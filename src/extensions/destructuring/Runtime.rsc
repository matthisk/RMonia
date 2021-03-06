module extensions::destructuring::Runtime

import extensions::destructuring::Syntax;

public Statement _slicedToArray
	= (Statement)`var _slicedToArray = function _slicedToArray(arr, i) { if (Array.isArray(arr)) { return arr; } else if (Symbol.iterator in Object(arr)) { var _arr = []; var _n = true; var _d = false; var _e = undefined; try { for (var _i = arr[Symbol.iterator](), _s; !(_n = (_s = _i.next()).done); _n = true) { _arr.push(_s.value); if (i && _arr.length === i) break; } } catch (err) { _d = true; _e = err; } finally { try { if (!_n && _i["return"]) _i["return"](); } finally { if (_d) throw _e; } } return _arr; } else { throw new TypeError("Invalid attempt to destructure non-iterable instance"); } };`;
				 
public Statement _toArray
	= (Statement)`var _toArray = function(arr) { return Array.isArray(arr) ? arr : Array.from(arr); };`;
