package Tiger01526

import Tiger01526.buildTypes.*
import Tiger01526.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01526")
    name = "Tiger01526"

    vcsRoot(Tiger01526_cVCSroot)

    buildType(Tiger01526_Hi3)
    buildType(Tiger01526_Hi0)
    buildType(Tiger01526_Hi1)
    buildType(Tiger01526_Hi2)
})
