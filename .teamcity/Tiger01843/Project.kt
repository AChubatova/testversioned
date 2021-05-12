package Tiger01843

import Tiger01843.buildTypes.*
import Tiger01843.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01843")
    name = "Tiger01843"

    vcsRoot(Tiger01843_cVCSroot)

    buildType(Tiger01843_Hi3)
    buildType(Tiger01843_Hi1)
    buildType(Tiger01843_Hi2)
    buildType(Tiger01843_Hi0)
})
