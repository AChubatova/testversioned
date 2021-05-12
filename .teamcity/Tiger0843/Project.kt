package Tiger0843

import Tiger0843.buildTypes.*
import Tiger0843.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0843")
    name = "Tiger0843"

    vcsRoot(Tiger0843_cVCSroot)

    buildType(Tiger0843_Hi2)
    buildType(Tiger0843_Hi3)
    buildType(Tiger0843_Hi0)
    buildType(Tiger0843_Hi1)
})
